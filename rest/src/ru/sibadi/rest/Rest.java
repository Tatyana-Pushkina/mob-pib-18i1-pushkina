package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;
    private final Table[] tables;

    public Rest() {
        this.name = "Lemon";
        this.menu = new Food[]{
                new Food("Lemon bread", 30.00),
                new Food("Lemon sadness", 2000.00),
                new Food("Lemon pie", 400.00),
                new Food("Lemon tea", 50.00)
        };
        this.tables = new Table[]{
                new Table("1", 100.0),
                new Table("2", 200.0),
                new Table("3", 300.0),
		new Table("4", 400.0)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}
