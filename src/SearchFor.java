public class SearchFor {
    public static void main(String[] args) {
        int[][] testArray = {
                {100,23,31,45},
                {9,2,3,5},
                {12,8,10}
        };

        int searchFor = 5;

        int i;
        int j=0;
        boolean found = false;

        search:
        for(i=0; i< testArray.length; i++){
            for(j=0; j<testArray[i].length; j++){
                if(testArray[i][j]==searchFor){
                    found = true;
                    break search;
                }
            }
        }

        if(found){
            System.out.println("Found " + searchFor + " at " + i + "," + j);
        } else {
            System.out.println(searchFor + " not in array.");
        }
    }
}
