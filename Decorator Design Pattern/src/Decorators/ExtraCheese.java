package Decorators;

import Base.Pizza;

public class ExtraCheese extends ToppingsDecorator {
    public Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 50;
    }
}
