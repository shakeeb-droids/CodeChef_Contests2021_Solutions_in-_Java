

class Student extends Person
{
	private int[] testScores;
    private int avg=0;
    private int sum=0;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String fn, String ln, int id, int testScore[])
    {
        super(fn,ln,id);
        this.testScores = testScore; 
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {
        
        for(int i=0;i<testScores.length;i++)
        {
            sum+=testScores[i];
        }
        avg=(sum/testScores.length);
        if(avg>=90)
        return 'O';
        else if(avg>=80)
        return 'E';
        else if(avg>=70)
        return 'A';
        else if(avg>=50)
        return 'P';
        else if(avg>40)
        return 'D';
        else
        return 'T';
    }
}

