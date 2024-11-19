package Decorators;

import Base.Pizza;

public class ExtraVeggies extends ToppingsDecorator {
    public Pizza pizza;

    public ExtraVeggies(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 30;
    }
}
