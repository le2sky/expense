package expensereport;

public abstract class Expense {

  abstract boolean isMeal();

  abstract boolean isOverage();

  public int amount;

  public Expense(int amount) {
    this.amount = amount;
  }
}
