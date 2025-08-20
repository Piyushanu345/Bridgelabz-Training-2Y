package Level1;
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;       // Division operator to get pens each student gets
        int remainingPens = totalPens % students;        // Modulus operator to get leftover pens

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
