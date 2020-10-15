package demo.arrays;

public class SmallestCommonNumber {

    public static void main(String[] args){
        SmallestCommonNumber smallestCommonNumber = new SmallestCommonNumber();
        int [] one = {5, 7, 8, 9, 10};
        int [] two = {4, 5, 6, 7};
        int [] three = {5, 6, 7, 8};

        int smallestCommon = smallestCommonNumber.find(one, two, three);
        System.out.println("smallest value is "+smallestCommon);
    }

    public int find(int[] one, int[] two, int[] three){

        int v1 = 0, v2 = 0, v3 = 0;


        while (v1 < one.length && v2 < two.length && v3 < three.length){

            if(one[v1] == two[v2] && two[v2] == three[v3]){
                return one[v1];
            }

            if(one[v1] <= two[v2] && one[v1] <= three[v3]){
                v1++;
            } else if(two[v2] <= one[v1] && two[v2] <= three[v3]){
                v2++;
            } else if(three[v3] <= one[v1] && three[v3] <= two[v2]){
                v3++;
            }
        }

        return -1;
    }
}
