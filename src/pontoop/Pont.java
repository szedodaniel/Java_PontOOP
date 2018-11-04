
package pontoop;

import java.util.Random;


public class Pont {
    public int x;
    public int y;
    static Random rnd = new Random();
        
        public Pont(int x, int y) {
            this.x = x;
            this.y = y;
        }
         public Pont() {
            this.x = 0;
            this.y = 0;
        }
        

        @Override
        public String toString() {
            return "Pont{" + "x=" + x + ", y=" + y + '}';
        }
     
          public double origoTavolsag()
        {
            return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        }
        public int GetX()
        {
            return this.x;
        }
        public int GetY()
        {
            return this.y;
        }
        public void SetX(int x)
        {
            this.x = x;

        }
        public void SetY(int y)
        {
            this.y = y;

        }
}
