package doublylinkedlist.moviemanagementsystem;

class MovieManagement {
    private Movie head;
    private Movie tail;

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        System.out.println("Movie added at the beginning.");
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("Movie added at the end.");
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (position == 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Invalid position. Adding at the end.");
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            } else {
                tail = newMovie;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
            System.out.println("Movie added at position " + position + ".");
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Search for a movie by director or rating
    public void searchMovie(String director, double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Movie Found: " + temp.title + ", Director: " + temp.director +
                        ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found with the specified director or rating.");
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Movies in Forward Order:");
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }
        System.out.println("Movies in Reverse Order:");
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's rating based on the title
    public void updateMovieRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for \"" + title + "\" to " + newRating + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }
}

