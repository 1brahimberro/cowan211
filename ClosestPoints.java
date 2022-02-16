public class ClosestPoints {

    public static double distance(double[] arr1, double[] arr2) {
    return Math.sqrt(Math.pow(arr2[0]-arr1[0], 2) + Math.pow(arr2[1]-arr1[1], 2) + Math.pow(arr2[2]-arr1[2], 2));
    }
    
    public static double[][][] inputArray(){

        System.out.println("Adding the array in...");

        double[][][] points = {
            {
              {1, -2}, 
              {2, 3}

            }, 
            { 
              {1,8}, 
              {2,3}
            },
            {
                {1,1},
                {22,35}
            }

        };
        closestPoints(points);
        return points;
    }

    public static void displayClosestPoints(int num1,int num2){

        System.out.println("The two closest points are ",num1,num2);

    }

    public static int closestPoints(double[][][] points){


        System.out.println(points.length);
        System.out.println(points[0].length);
        System.out.println(points[0][0].length);

        for (int threeD = 0; threeD < points.length;++threeD){
            for (int twoD = 0; twoD < points[0].length;++twoD){
                for (int oneD = 0; oneD < points[0][0].length;++oneD){
                    if (distance(points[i], points[j]) < distance(points[ind1], points[ind2])) {
                        ind1 = i;
                        ind2 = j;
                    }

                }

            }
        }

        /*
        int ind1 = 0, ind2 = 1;
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                if (distance(points[i], points[j]) < distance(points[ind1], points[ind2])) {
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        */
        return 0;
    }


    public static void main(String[] args) {
    inputArray();
    //System.out.print(inputArray());
    //ClosestPoints(tempPoints);
    double[][] points = {
        {-1, 0, 3}, 
        {-1, -1, -1}, 
        {4, 1, 1}, 
        {2, 0.5, 9}, 
        {3.5, 2, -1}, 
        {3, 1.5, 3}, 
        {-1.5, 4, 2}, 
        {5.5, 4, -0.5}
    };
    

    //System.out.printf("Closest points are (%f, %f, %f) and (%f, %f, %f)\n", points[ind1][0], points[ind1][1], points[ind1][2], points[ind2][0], points[ind2][1], points[ind2][2]);
    //System.out.println("Distance between closest points is " + distance(points[ind1], points[ind2]));
    }
    
    }