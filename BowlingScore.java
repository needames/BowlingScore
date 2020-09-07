public class BowlingScore {
    private int throws[] = new int[21];
    private int currentThrow = 0;
    
    public void throw(int pins){
        throws[currentThrow++] = pins;
    }
    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++){
            if (throws[frameIndex] == 10)
            {
                score+= 10+
                    throws[frameIndex + 1] +
                    throws[frameIndex + 2];
                frameIndex++;
            }
            else if (isSpare(frameIndex))
            {
                score += 10 + throws[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += throws[frameIndex] +
                    throws[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;
    }
    private boolean isSpare(int frameIndex) {
        return throws[frameIndex] +
            throws[frameIndex + 1] == 10;
                  }
                  }



//Donahue, David, director. Bowling Game - Java. Youtube: Bowling Game - Java, 4 Apr. 2014, www.youtube.com/watch?v=qnqzK25Ikdw. 
                  