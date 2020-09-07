public class BowlingScore {
   
    private int throws[] = new int[21]; //max total number of possible throws
    private int currentThrow = 0;
    
    public static void main(String[] args) {
    public void throw(int pins){
        throws[currentThrow++] = pins;
    }
    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++){  //Frame increments up to 10
            if (throws[frameIndex] == 10) //If the bowler throws a strike
            {
                score+= 10+
                    throws[frameIndex + 1] +
                    throws[frameIndex + 2]; //10 points for the strike plus the score of next two throws
                frameIndex++;
            }
            else if (isSpare(frameIndex)) //If bowler throws a spare
            {
                score += 10 + throws[frameIndex + 2]; //10 points for spare plus the score of very next throw
                frameIndex += 2;
            } 
            else { //Open Frame
                score += throws[frameIndex] + 
                    throws[frameIndex + 1]; //Total score of both throws in a frame
                frameIndex += 2; 
            }
        }
        System.out.println("The Final Score is: " + frameIndex); //Final Score 
    }
    private boolean isSpare(int frameIndex) {
        return throws[frameIndex] +
            throws[frameIndex + 1] == 10; //Scoring of a spare
                  }
                  }
}



//Citation: Donahue, David, director. Bowling Game - Java. Youtube: Bowling Game - Java, 4 Apr. 2014, www.youtube.com/watch?v=qnqzK25Ikdw. 
                  