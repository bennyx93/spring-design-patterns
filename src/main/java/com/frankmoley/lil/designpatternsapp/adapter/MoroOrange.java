package com.frankmoley.lil.designpatternsapp.adapter;

public class MoroOrange implements Orange{
    @Override
    public String getVariety() {
        return "Moro Blood Orange";
    }

    @Override
    public void eat() {
        System.out.println("Eating Moro Orange");
    }

    @Override
    public void peel() {
        System.out.println("Moro getting peeled");
    }

    @Override
    public void juice() {
        System.out.println("Moro gets juiced");
    }
}
