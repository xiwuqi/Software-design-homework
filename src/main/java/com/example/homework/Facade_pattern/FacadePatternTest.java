package com.example.homework.Facade_pattern;

public class FacadePatternTest {
    public static void main(String[] args) {
        SecurityFacade securityFacade = new SecurityFacade();

        // Activating the security system
        securityFacade.activate();

        System.out.println("--------");

        // Deactivating the security system
        securityFacade.deactivate();
    }
}

