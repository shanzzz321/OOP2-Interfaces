package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.draw().toString());
        deck.shuffle();
        System.out.println(drawCards(deck, 3));
    }

    public static List<Card> drawCards(CardSource pDeck, int pNumber) {
        List<Card> result = new ArrayList<>();
        for( int i = 0; i < pNumber && !pDeck.isEmpty(); i++ ) {
            result.add(pDeck.draw());
        }
        return result;
    }
}
