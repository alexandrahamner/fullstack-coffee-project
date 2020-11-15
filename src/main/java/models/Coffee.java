package models;

public class Coffee {
    private long id;
    private long userId;
    private String coffeeName;
    private String roast;
    private String description;

    public Coffee() {}

    public Coffee(long id, long userId, String coffeeName, String roast, String description) {
        this.id = id;
        this.userId = userId;
        this.coffeeName = coffeeName;
        this.roast = roast;
        this.description = description;

    }

    public Coffee(long userId, String coffeeName, String roast, String description) {
        this.userId = userId;
        this.coffeeName = coffeeName;
        this.roast = roast;
        this.description = description;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
