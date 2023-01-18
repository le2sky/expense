package expensereport;

public abstract class Expense {

  abstract boolean isMeal();

  abstract boolean isOverage();

  public enum Type {DINNER, BREAKFAST, CAR_RENTAL}

  ;
  public Type type;
  public int amount;

  public Expense(Type type, int amount) {
    this.type = type;
    this.amount = amount;
  }
}
