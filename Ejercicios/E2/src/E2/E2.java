package E2;

public class E2 {
    public static int sumaPares(int[] vector){
        int s=0;
        //int [] vector1={0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};

        for(int i=0;i<vector.length;i++){
            if(vector[i]%2==0){
                s=s+vector[i];
            }
        }
        System.out.println(s);
        return s;
    }
}
