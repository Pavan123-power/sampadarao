 class BillMaxNumberOfGifts{

     public static void main(String []args)
{
        char[] students = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int[] studentsRandomGits = new int[students.length];
        int i,j,tmp;
        char tmpStu;
        System.out.println("Students and their random gifts");
        for(i=0;i<students.length; i++) {
            studentsRandomGits[i] = (int) (Math.random() * 10);
            System.out.println(students[i] + " => " + studentsRandomGits[i]);
}
        System.out.println("Accountant proeccing student's random gifts");
        for(i=0; i< studentsRandomGits.length; i++) {
            for(j=i+1; j<studentsRandomGits.length; j++) {
                if(studentsRandomGits[j] > studentsRandomGits[i]) {
                    // swap gift
                    tmp = studentsRandomGits[j];
                    studentsRandomGits[j] = studentsRandomGits[i];
                    studentsRandomGits[i] = tmp;
                    // swap student
                    tmpStu = students[j];
                    students[j] = students[i];
                    students[i] = tmpStu;
                }
            }
        System.out.println(students[i] + " => " + studentsRandomGits[i]);
        }
     }
}
