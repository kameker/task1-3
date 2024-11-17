package vgu.dz.Main;



import static vgu.dz.seventh.seventh.solution;


public class Main {
    public static void main(String[] args) {
        int[] arr = {-3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3};
        int n = 3;
        int result = solution(arr, n);
        System.out.println("Индекс первого элемента: " + result);
    }
}

