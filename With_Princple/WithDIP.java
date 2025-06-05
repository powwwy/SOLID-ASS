package With_Princple;
/* This class is used to demonstrate the implementation of
Dependency Inversion Principle by loosening coupling using an interface */

interface Movement {
    void move();
}

class Run implements Movement {
    public void move() {
        System.out.println("Player is running");
    }
}

class Jump implements Movement {
    public void move() {
        System.out.println("Player is jumping");
    }
}

class Slide implements Movement {
    public void move() {
        System.out.println("Player is sliding");
    }
}

class Player {
    private Movement movement;

    public Player(Movement movement) {
        this.movement = movement;
    }

    public void performMove() {
        movement.move();
    }
}