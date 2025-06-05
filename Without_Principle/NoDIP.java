package Without_Principle;/*This class is used to show the bad practice of a higher level class (Without_Principle.Player)
being tightly coupled with lower level classes (Without_Principle.Run and Without_Principle.Jump) */

class Run {
    public void execute() {
        System.out.println("Player is running");
    }
}

class Jump {
    public void execute() {
        System.out.println("Player is jumping");
    }
}

class Player {
    private Run run = new Run();
    private Jump jump = new Jump();

    public void run() {
        run.execute();
    }

    public void jump() {
        jump.execute();
    }
}
