package data.structures;

public class RabbitProblem {

    static int rabbits(int n) {
        if (n <= 2)
            return 1;
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(rabbits(7));
    }
}

