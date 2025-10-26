package com.provider.billing.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import com.provider.billing.model.Item;

@Component
public class Menu {

    private final Scanner sc = new Scanner(System.in);

    public List<Item> menuItems() {
        System.out.println("Select any one item category:");
        System.out.println("1. Breakfast\n2. Lunch\n3. Dinner");

        int num = sc.nextInt();

        switch (num) {
            case 1: return breakfast();
            case 2: return lunch();
            case 3: return dinner();
            default: throw new IllegalArgumentException("Unexpected value: " + num);
        }
    }

    private List<Item> breakfast() {
        String choice = "yes";
        List<Item> items = new ArrayList<>();

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select a breakfast item:");
            System.out.println("1. Idly\n2. Pongal");
            
            int num = sc.nextInt();
          
            Item item = new Item(); // ⚡ new instance for each selection

            switch (num) {
                case 1: item.setName("Idly"); item.setPrice(50); break;
                case 2: item.setName("Pongal"); item.setPrice(40); break;
                default: System.out.println(("Invalid breakfast item: " + num));
            }

            items.add(item);

            System.out.println("Do you want to continue breakfast? (yes/no)");
            choice = sc.next();
        }

        return items;
    }

    private List<Item> lunch() {
        String choice = "yes";
        List<Item> items = new ArrayList<>();

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select a lunch item:");
            System.out.println("1. Rice Bowl\n2. Veg Biryani");

            int num = sc.nextInt();
            Item item = new Item();

            switch (num) {
                case 1: item.setName("Rice Bowl"); item.setPrice(110); break;
                case 2: item.setName("Veg Biryani"); item.setPrice(150); break;
                default: System.out.println(("Invalid breakfast item: " + num));
            }

            items.add(item);

            System.out.println("Do you want to continue lunch? (yes/no)");
            choice = sc.next();
        }

        return items;
    }

    private List<Item> dinner() {
        String choice = "yes";
        List<Item> items = new ArrayList<>();

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select a dinner item:");
            System.out.println("1. Paratha\n2. Vada");

            int num = sc.nextInt();
            Item item = new Item();

            switch (num) {
                case 1: item.setName("Paratha"); item.setPrice(80); break;
                case 2: item.setName("Vada"); item.setPrice(60); break;
                default: System.out.println(("Invalid breakfast item: " + num));
            }

            items.add(item);

            System.out.println("Do you want to continue dinner? (yes/no)");
            choice = sc.next();
        }

        return items;
    }
}
