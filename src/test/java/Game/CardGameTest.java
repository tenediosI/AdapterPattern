package Game;

import Console.ConsoleInput;
import Console.ConsoleOutput;
import Console.InputTestAdapter;
import Game.CardGame;
import Structure.Hand;
import Structure.LoadConfig;
import Structure.LoadTestAdapter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {
    CardGame cardGame = new CardGame();

    @Test
    void getComputerPlayersNamesAdapter() {
    	List<String> adaptNames = new ArrayList<String>();
    	adaptNames.add("Bob");
    	adaptNames.add("Rob");
    	adaptNames.add("Paul");
    	LoadConfig loadConfig = new LoadConfig();
    	LoadTestAdapter loadTestAdapter = new LoadTestAdapter(loadConfig);
    	loadTestAdapter.setNames(adaptNames);
    	cardGame.setLoadConfig(loadTestAdapter);
    	cardGame.createComputerPlayers(3);
    	loadTestAdapter.setNames(adaptNames);
        assertEquals(adaptNames, cardGame.getComputerPlayersNames());
    }
    @Test
    void createComputerPlayersAdapter() {
    	List<String> adaptNames = new ArrayList<String>();
    	adaptNames.add("Bob");
    	adaptNames.add("Rob");
    	adaptNames.add("Paul");
    	LoadConfig loadConfig = new LoadConfig();
    	LoadTestAdapter loadTestAdapter = new LoadTestAdapter(loadConfig);
    	loadTestAdapter.setNames(adaptNames);
    	cardGame.setLoadConfig(loadTestAdapter);
    	cardGame.createComputerPlayers(3);
        assertEquals("Paul",cardGame.players.get(2).getName());
    }
    @Test
    void createComputerPlayersSizeAdapter() {
    	List<String> adaptNames = new ArrayList<String>();
    	adaptNames.add("Bob");
    	adaptNames.add("Rob");
    	adaptNames.add("Paul");
    	LoadConfig loadConfig = new LoadConfig();
    	LoadTestAdapter loadTestAdapter = new LoadTestAdapter(loadConfig);
    	loadTestAdapter.setNames(adaptNames);
    	cardGame.setLoadConfig(loadTestAdapter);
    	cardGame.createComputerPlayers(3);
        assertEquals(3,cardGame.players.size());
    }
    @Test
    void createHumanPlayerAdapter() {
    	ConsoleOutput consoleOutput = new ConsoleOutput();
    	ConsoleInput consoleInput = new ConsoleInput(consoleOutput);
    	InputTestAdapter inputTestAdapter = new InputTestAdapter(consoleInput);
    	inputTestAdapter.setString("Rob");
    	cardGame.setInput(inputTestAdapter);
    	cardGame.createHumanPlayer();
        assertEquals("Rob", cardGame.players.get(0).getName());
    }
    @Test
    void initiatePlayersAdapter() {
    	ConsoleOutput consoleOutput = new ConsoleOutput();
    	ConsoleInput consoleInput = new ConsoleInput(consoleOutput);
    	InputTestAdapter inputTestAdapter = new InputTestAdapter(consoleInput);
    	inputTestAdapter.setString("Rob");
    	inputTestAdapter.setInteger(4);
    	cardGame.setInput(inputTestAdapter);
    	cardGame.initiatePlayers();
    	assertEquals(5, cardGame.players.size());
    }
    @Test
    void initiateAdapter(){
    	ConsoleOutput consoleOutput = new ConsoleOutput();
    	ConsoleInput consoleInput = new ConsoleInput(consoleOutput);
    	InputTestAdapter inputTestAdapter = new InputTestAdapter(consoleInput);
    	inputTestAdapter.setString("Rob");
    	inputTestAdapter.setInteger(4);
    	cardGame.setInput(inputTestAdapter);
    	cardGame.initiate();
    	assertEquals(2, cardGame.players.get(0).getHand().size());
    }
    @Test
    void playAdapter(){
    	ConsoleOutput consoleOutput = new ConsoleOutput();
    	ConsoleInput consoleInput = new ConsoleInput(consoleOutput);
    	InputTestAdapter inputTestAdapter = new InputTestAdapter(consoleInput);
    	inputTestAdapter.setString("Rob");
    	inputTestAdapter.setInteger(4);
    	cardGame.setInput(inputTestAdapter);
    	cardGame.setFinishGame(true);
        cardGame.play();
        assertTrue(cardGame.finshGame);
    }

}