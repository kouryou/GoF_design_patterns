
public class Hand {
  public static final int ROCK = 0;
  public static final int SCISSORS = 1;
  public static final int PAPER = 2;
  public static final Hand[] hand = {
      new Hand(ROCK),
      new Hand(SCISSORS),
      new Hand(PAPER),
  };
  private static final String[] name = {"グー", "チョキ", "パー"};
  private int handValue;
  
  private Hand(int handValue) {
    this.handValue = handValue;
  }
  
  public static Hand getHand(int handValue) {
    return hand[handValue];
  }
  
  public boolean isStrongerThan(Hand h) {
    return fight(h) == 1;
  }
  
  public boolean isWeakerThan(Hand h) {
    return fight(h) == -1;
  }
  
  private int fight(Hand h) {
    if (this == h) {
      return 0;
    } else if ((this.handValue + 1) % 3 == h.handValue) {
      return 1;
    } else {
      return -1;
    }
  }
  
  public String toName() {
    return name[this.handValue];
  }
}
