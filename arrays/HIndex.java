import java.util.Arrays;

public  class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5}; // Example array of citations
        int hIndex = calculateHIndex(citations);
        System.out.println("The H-Index is: " + hIndex);
    }
    public static int calculateHIndex(int[] citations) {
        // Implementation for calculating H-Index
        Arrays.sort(citations);
        int n = citations.length;
        for(int i=0;i<n;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }
        return 0;
    }
}
