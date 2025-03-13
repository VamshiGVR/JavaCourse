public class M {

    public static void main(String[] args){
        int [][]A = {{1,2,3},{4,5,6}};

        System.out.println("Postion Value: " + A[0][2]);       
        
        int []B ={11,22,33};
        int []C ={44,55,66};
        int []D ={77,88,99};
        for(int i=0 ; i<B.length; i++)
                for(int j=0 ; j<C.length; j++)
                        for(int k=0 ; k<D.length; k++)
                            System.out.println(B[i] +" "+ C[j]+" " +D[k]);
    }
}
