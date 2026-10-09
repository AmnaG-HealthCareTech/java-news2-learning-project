public class patientsScore 

{
    public static void main(String[] args)
    {

        News2Calc patientOne = new News2Calc(8, 94, 105, 88,37.5 , "Alert");

        patientOne.ScoreCalc ();
        patientOne.OxyScoreCalc();
        patientOne.BpScoreCalc();
        patientOne.PulseScoreCalc(); 
        patientOne.TempScoreCalc(); 
        patientOne.StatCalc();
        patientOne.TotalCalc();

        
    }
    


}
