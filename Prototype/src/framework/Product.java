package framework;

public interface Product extends Cloneable {
  public abstract void use(String st);
  public abstract Product createClone();
}
