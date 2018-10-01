import java.util.Random;

public class ProbStrategy implements Strategy {
  private Random random;
  private boolean won = false;
  private Hand prevHand;
  
  public ProbStrategy(int seed) {
    this.random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    if (won) {
      this.prevHand = Hand.getHand(random.nextInt(3));
    }
    return this.prevHand;
  }

  @Override
  public void study(boolean win) {
    this.won = win;
  }
}
