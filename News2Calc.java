public class News2Calc 
{
    int RespRate;
    int SpO2; 
    int SystolicBp; 
    int Pulse;
    double temperature; 
    String State;
    int NewsScore;
    int RespNewScores;
    int OxyNewScores;
    int BpNewScores;
    int PulseNewScores;
    int TempNewsScores;
    int StateNewsScore;
    



    int[][] RespRanges = 
    {
        {0, 8},
        {9, 11},
        {12, 20},
        {21, 24},
        {25, 100}
    };

    int [] RespScores =
    
      {3,1,0,2,3 };


      int[][] OxyRanges = 
    {
        {0, 91},
        {92, 93},
        {94, 95},
        {96, 100},
        
    };

    int [] OxyScores =
    
      {3,2,1,0 };


      int[][] BpRanges = 
    {
        {0, 90},
        {91, 100},
        {101, 110},
        {111, 219},
        {220, 300}
    };

    int [] BpScores =
    
      {3,2,1,0,3 };


      int[][] PulseRanges = 
    {
        {0, 40},
        {41, 50},
        {51, 90},
        {91, 110},
        {111, 130},
        {131, 300}
        
        
        
    };

    int [] PulseScores =
    
      {3,1,0,1,2,3 };

      double[][] TempRanges = 
    {
        {32.0, 35.0},
        {35.1, 36.0},
        {36.1, 38.0},
        {38.1, 39.0},
        {39.1, 45.0}
        
        
        
    };

    int [] TempScores =
    
      {3,1,0,1,2 };

    

    public News2Calc (int enteredRespRate, int enteredSpO2, int enteredSystolicBp, int enteredPulse, double enteredTemp, String enteredState)
    {
        RespRate = enteredRespRate;
        SpO2 = enteredSpO2;
        SystolicBp = enteredSystolicBp;
        Pulse = enteredPulse;
        temperature = enteredTemp;
        State = enteredState;

        

       


    }

    public void StatCalc ()
    {
      
        if( State.equals("Alert") )
        {
             StateNewsScore = 0;


        }
        else
        {
            StateNewsScore=3;
        }
    }

    public void ScoreCalc ()
    { 
        for (int row =0; row <5; row++)
            {
               
                if (RespRate >= RespRanges[row][0] && RespRate<= RespRanges[row][1])
                {
                    //System.out.println(RespScores[row]);
                     RespNewScores =RespScores[row] ;
                    

                }
     
            }
           
    



    }
    
    

    public void OxyScoreCalc ()
    {
        for (int row =0; row <4; row++)
        {
            if(SpO2 >= OxyRanges [row][0] && SpO2 <= OxyRanges [row][1])
            {
               // System.out.println(OxyScores[row]);
                OxyNewScores =OxyScores[row] ;

            }

        }
    }


    public void BpScoreCalc ()
    {
        for (int row =0; row <5; row++)
        {
            if(SystolicBp >= BpRanges [row][0] && SystolicBp <= BpRanges [row][1])
            {
                //System.out.println(BpScores[row]);
                BpNewScores =BpScores[row] ;

            }

        }
    }


    public void PulseScoreCalc ()
    {
        for (int row =0; row <6; row++)
        {
            if(Pulse >= PulseRanges [row][0] && Pulse <= PulseRanges [row][1])
            {
                //System.out.println(PulseScores[row]);
                PulseNewScores=PulseScores[row] ;

            }

        }
    }

    public void TempScoreCalc ()
    {
        for (int row =0; row <5; row++)
        {
            if(temperature >= TempRanges [row][0] && temperature <= TempRanges [row][1])
            {
                //System.out.println(TempScores[row]);
                 TempNewsScores =TempScores[row];

            }

        }
    }

    public void TotalCalc ()
    {
        NewsScore=RespNewScores + TempNewsScores + OxyNewScores + BpNewScores +PulseNewScores+StateNewsScore ;
        System.out.println(NewsScore);




    }

    




    


    
}
