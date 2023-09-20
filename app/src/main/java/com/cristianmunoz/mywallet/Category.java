package com.cristianmunoz.mywallet;

public class Category {
    private String name;
    private String color; // Representa el color de la categoría (por ejemplo, "#FF5733")
    private String imageUrl; // URL de la imagen de la categoría

    public Category(String name, String color, String imageUrl) {
        this.name = name;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
