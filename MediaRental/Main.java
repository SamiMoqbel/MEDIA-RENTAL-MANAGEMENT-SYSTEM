package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		MediaRentalManager mdr = new MediaRentalManager();
		String ButtonColor = "-fx-background-color: #5AB4D0; " + "-fx-text-fill: White;";

		// home Page image
		Image homeImage = new Image("https://wpengine.com/wp-content/uploads/2018/03/colour-without-text.png");
		ImageView homeImageView = new ImageView(homeImage);

		// scenes

		// Customer Scene:

		// Customer Buttons:

		Button addcustomerButton = new Button("Add new Customer");
		addcustomerButton.setPrefSize(450, 70);
		addcustomerButton.setStyle(ButtonColor);
		Button deletecustomerButton = new Button("Delete Customer");
		deletecustomerButton.setPrefSize(450, 70);
		deletecustomerButton.setStyle(ButtonColor);
		Button updateCustomerButton = new Button("Update Information about Customer");
		updateCustomerButton.setPrefSize(450, 70);
		updateCustomerButton.setStyle(ButtonColor);
		Button searchCustomerButton = new Button("Search a Customer by id");
		searchCustomerButton.setPrefSize(450, 70);
		searchCustomerButton.setStyle(ButtonColor);

		Button homeButton = new Button("Return to main page");
		homeButton.setPrefSize(450, 70);
		homeButton.setStyle(ButtonColor);

		VBox customerButtons = new VBox(40);
		customerButtons.getChildren().addAll(addcustomerButton, deletecustomerButton, updateCustomerButton,
				searchCustomerButton, homeButton);

		BorderPane customerPane = new BorderPane();
		customerPane.setCenter(customerButtons);
		customerPane.setMargin(customerButtons, new Insets(320, 200, 200, 700));
		Scene customerScene = new Scene(customerPane, 1000, 1000);

		// Add/Delete/Searching Customer Scene:

		Image addButtonImage = new Image("https://img.icons8.com/ios/344/add-administrator.png");
		ImageView addButtonView = new ImageView(addButtonImage);

		Image backButtonImage = new Image(
				"https://img.icons8.com/external-flatart-icons-outline-flatarticons/344/external-back-arrow-flatart-icons-outline-flatarticons-1.png");
		ImageView backButtonView = new ImageView(backButtonImage);
		ImageView backButtonView1 = new ImageView(backButtonImage);
		ImageView backButtonView2 = new ImageView(backButtonImage);
		ImageView backButtonView3 = new ImageView(backButtonImage);

		Image findButtonImage = new Image("https://img.icons8.com/ios-filled/344/find-user-male.png");
		ImageView findButtonView = new ImageView(findButtonImage);
		ImageView findButtonView1 = new ImageView(findButtonImage);
		ImageView searchButtonView = new ImageView(findButtonImage);

		Image updateButtonImage = new Image(
				"https://image.shutterstock.com/image-vector/software-update-process-completed-vector-600w-1033612402.jpg");
		ImageView updateButtonView = new ImageView(updateButtonImage);

		Image deleteButtonImage = new Image("https://img.icons8.com/ios/344/remove-administrator.png");
		ImageView deleteButtonView = new ImageView(deleteButtonImage);

		updateButtonView.setFitHeight(50);
		updateButtonView.setFitWidth(50);

		deleteButtonView.setFitHeight(50);
		deleteButtonView.setFitWidth(50);

		findButtonView.setFitHeight(50);
		findButtonView.setFitWidth(50);

		findButtonView1.setFitHeight(50);
		findButtonView1.setFitWidth(50);

		searchButtonView.setFitHeight(50);
		searchButtonView.setFitWidth(50);

		backButtonView.setFitHeight(50);
		backButtonView.setFitWidth(50);

		backButtonView1.setFitHeight(50);
		backButtonView1.setFitWidth(50);

		backButtonView2.setFitHeight(50);
		backButtonView2.setFitWidth(50);

		backButtonView3.setFitHeight(50);
		backButtonView3.setFitWidth(50);

		addButtonView.setFitHeight(50);
		addButtonView.setFitWidth(50);

		TextField planField = new TextField();
		planField.setPromptText("Plan here");

		TextField planField1 = new TextField();
		planField1.setPromptText("Plan here");

		TextField planField2 = new TextField();
		planField2.setPromptText("Plan here");

		ComboBox<String> plannode = new ComboBox();
		plannode.getItems().add("Limited");
		plannode.getItems().add("Unlimited");

		Button addButton = new Button("Add");
		addButton.setGraphic(addButtonView);

		Button backButton = new Button("Back");
		backButton.setGraphic(backButtonView);

		Button backButton1 = new Button("Back");
		backButton1.setGraphic(backButtonView1);

		Button backButton2 = new Button("Back");
		backButton2.setGraphic(backButtonView2);

		Button backButton3 = new Button("Back");
		backButton3.setGraphic(backButtonView3);

		Button findButton = new Button("Find");
		findButton.setGraphic(findButtonView);

		Button findButton1 = new Button("Find");
		findButton1.setGraphic(findButtonView1);

		Button searchButton = new Button("Search");
		searchButton.setGraphic(searchButtonView);

		Button updateButton = new Button("Update");
		updateButton.setGraphic(updateButtonView);

		Button deleteButton = new Button("Delete");
		deleteButton.setGraphic(deleteButtonView);

//		GridPane infoPane= new GridPane();

		GridPane deleteinfoPane = getinfoPane();
		deleteinfoPane.add(planField, 1, 4);

		GridPane addinfoPane = getinfoPane();
		addinfoPane.add(plannode, 1, 4);

		GridPane searchinfoPane = new GridPane();
		TextArea infoArea = new TextArea();
		infoArea.setPrefSize(400, 800);
		Label searchPaneId=new Label("ID");
		Label searchPaneInfo=new Label("Customer Data:");
		TextField searchPaneID=new TextField();
		searchinfoPane.add(searchPaneId, 0, 0);
		searchinfoPane.add(searchPaneID, 1, 0);
		searchinfoPane.add(searchPaneInfo,0,2);
		searchinfoPane.add(infoArea, 1, 2);
		searchinfoPane.setPadding(new Insets(400, 300, 0, 700));
		searchinfoPane.setVgap(50);
		searchinfoPane.setHgap(20);

		GridPane updateinfoPane = getinfoPane();
		updateinfoPane.add(planField2, 1, 4);

		HBox addbackbuttonPane = new HBox(60);
		addbackbuttonPane.getChildren().addAll(addButton, backButton);
		addbackbuttonPane.setPadding(new Insets(10, 50, 300, 800));

		HBox finddeletebackbuttonsPane = new HBox(60);
		finddeletebackbuttonsPane.getChildren().addAll(findButton, deleteButton, backButton1);
		finddeletebackbuttonsPane.setPadding(new Insets(10, 50, 300, 800));

		HBox searchbackbuttonsPane = new HBox(60);
		searchbackbuttonsPane.getChildren().addAll(searchButton, backButton2);
		searchbackbuttonsPane.setPadding(new Insets(10, 50, 300, 800));

		HBox findupdatebackbuttonsPane = new HBox(60);
		findupdatebackbuttonsPane.getChildren().addAll(findButton1, updateButton, backButton3);
		findupdatebackbuttonsPane.setPadding(new Insets(10, 50, 300, 800));
		// Adding Customer Pane
		BorderPane addingPane = new BorderPane();
		addingPane.setCenter(addinfoPane);
		addingPane.setBottom(addbackbuttonPane);

		// Deleting Customer Pane
		BorderPane deletingPane = new BorderPane();
		deletingPane.setCenter(deleteinfoPane);
		deletingPane.setBottom(finddeletebackbuttonsPane);

		// Search Customer Pane
		BorderPane searchingPane = new BorderPane();
		searchingPane.setCenter(searchinfoPane);
		searchingPane.setBottom(searchbackbuttonsPane);
		// Update Customer Pane
		BorderPane updatingPane = new BorderPane();
		updatingPane.setCenter(updateinfoPane);
		updatingPane.setBottom(findupdatebackbuttonsPane);

		Scene addCustomerScene = new Scene(addingPane, 1000, 1000);
		Scene deleteCustomerScene = new Scene(deletingPane, 1000, 1000);
		Scene searchCustomerScene = new Scene(searchingPane, 1000, 1000);
		Scene updateCustomerScene = new Scene(updatingPane, 1000, 1000);
		
		//Media Scene:
		
		
		
		
		
		
		 
		
		Button addMediaButton=new Button("Add new Media");
		Button deleteMediaButton=new Button("Delete Media");
		Button updateMediaButton=new Button("Update Information about Media");
		Button searchMediaButton=new Button("Search a Media by code");
		Button printMediaButton=new Button("Print All Media information");
		Button returnButton=new Button("Return to main page");
		VBox buttonsPane=new VBox(30);
		
		addMediaButton.setPrefSize(450, 70);
		addMediaButton.setStyle(ButtonColor);
		
		deleteMediaButton.setPrefSize(450, 70);
		deleteMediaButton.setStyle(ButtonColor);
		
		updateMediaButton.setPrefSize(450, 70);
		updateMediaButton.setStyle(ButtonColor);
		
		searchMediaButton.setPrefSize(450, 70);
		searchMediaButton.setStyle(ButtonColor);
		
		printMediaButton.setPrefSize(450, 70);
		printMediaButton.setStyle(ButtonColor);
		
		returnButton.setPrefSize(450, 70);
		returnButton.setStyle(ButtonColor);
		
		
		buttonsPane.getChildren().addAll(addMediaButton,deleteMediaButton,updateMediaButton,
										 searchMediaButton,printMediaButton,returnButton);
		buttonsPane.setPadding(new Insets(250,150,0,750));
		
		
		
		Scene mediaScene=new Scene(buttonsPane,1000,1000);
		//Add media Scene:
		
		//media selection Scene:
		
		ComboBox<String> mediaSelectionBox=new ComboBox<String>();
		mediaSelectionBox.getItems().add("Game");
		mediaSelectionBox.getItems().add("Album");
		mediaSelectionBox.getItems().add("Movie");
		mediaSelectionBox.setPromptText("ENTER THE MEDIA TYPE HERE");
		Button proceedButton=new Button("PROCEED!!");
		Button addMediaBackButton=new Button("Back");
		
		
		mediaSelectionBox.setPrefSize(300, 70);
		mediaSelectionBox.setStyle(ButtonColor);
		
		proceedButton.setPrefSize(250, 35);
		proceedButton.setStyle(ButtonColor);
		
		addMediaBackButton.setPrefSize(250, 35);
		addMediaBackButton.setStyle(ButtonColor);
		
		
		
		HBox addMediabuttonsBox=new HBox(20);
		addMediabuttonsBox.getChildren().addAll(proceedButton,addMediaBackButton);
		GridPane typeSelectionMenu=new GridPane();
		typeSelectionMenu.getChildren().addAll(mediaSelectionBox,addMediabuttonsBox);
		typeSelectionMenu.setPadding(new Insets(500,150,0,750));
		typeSelectionMenu.setVgap(30);
		typeSelectionMenu.setHgap(20);
		typeSelectionMenu.setConstraints(mediaSelectionBox, 0, 0);
		typeSelectionMenu.setConstraints(addMediabuttonsBox, 0, 1);
		Scene mediaTypeSelectionScene=new Scene(typeSelectionMenu,1000,1000);
		
		//add game scene:
		TextField gameTitleField=new TextField();
		TextField gameNumberOfCopiesField=new TextField();
		TextField gameWeightField=new TextField();
		TextField gameCodeField=new TextField();
		Label gameTitleLabel=new Label("Game Title :");
		Label gameNumberOfCopiesLabel=new Label("Number Of Copies :");
		Label gameWeightLabel=new Label("Game Weight :");
		Label gameCodeLabel=new Label("Game Code :");
		Button addGameBackButton=new Button("Back");
		Button addGameProceedButton=new Button("Proceed");
		
		HBox gameTitleBox=new HBox(20);
		gameTitleBox.getChildren().addAll(gameTitleLabel,gameTitleField);
		HBox gameNumberOfCopiesBox=new HBox(20);
		gameNumberOfCopiesBox.getChildren().addAll(gameNumberOfCopiesLabel,gameNumberOfCopiesField);
		HBox gameWeightBox=new HBox(20);
		gameWeightBox.getChildren().addAll(gameWeightLabel,gameWeightField);
		HBox gameCodeBox=new HBox(20);
		gameCodeBox.getChildren().addAll(gameCodeLabel,gameCodeField);
		HBox addGameButtonsBox=new HBox(20);
		addGameButtonsBox.getChildren().addAll(addGameProceedButton,addGameBackButton);
		
		VBox addGamePane=new VBox(30);
		addGamePane.getChildren().addAll(gameTitleBox,gameNumberOfCopiesBox,gameWeightBox,gameCodeBox,addGameButtonsBox);
		addGamePane.setPadding(new Insets(400,300,200,850));
		
		Scene addGameScene=new Scene(addGamePane,1000,1000);
		
		//add album scene:
		
		TextField albumTitleField=new TextField();
		TextField albumNumberOfCopiesField=new TextField();
		TextField albumArtistField=new TextField();
		TextField songsField=new TextField();
		TextField albumCodeField=new TextField();
		Label albumTitleLabel=new Label("Album Title :");
		Label albumNumberOfCopiesLabel=new Label("Album Number Of Copies :");
		Label albumArtistLabel=new Label("Album Artist :");
		Label songsLabel=new Label("Songs :");
		Label albumCodeLabel=new Label("Album Code :");	
		Button addAlbumBackButton=new Button("Back");
		Button addAlbumProceedButton=new Button("Proceed");
		
		HBox albumTitleBox=new HBox(20);
		albumTitleBox.getChildren().addAll(albumTitleLabel,albumTitleField);
		HBox albumNumberOfCopiesBox=new HBox(20);
		albumNumberOfCopiesBox.getChildren().addAll(albumNumberOfCopiesLabel,albumNumberOfCopiesField);
		HBox albumArtistBox=new HBox(20);
		albumArtistBox.getChildren().addAll(albumArtistLabel,albumArtistField);
		HBox songsBox=new HBox(20);
		songsBox.getChildren().addAll(songsLabel,songsField);
		HBox albumCodeBox=new HBox(20);
		albumCodeBox.getChildren().addAll(albumCodeLabel,albumCodeField);
		HBox addAlbumButtonsBox=new HBox(20);
		addAlbumButtonsBox.getChildren().addAll(addAlbumProceedButton,addAlbumBackButton);
		
		VBox addAlbumPane=new VBox(30);
		addAlbumPane.getChildren().addAll(albumTitleBox,albumNumberOfCopiesBox,albumArtistBox,albumCodeBox,songsBox,addAlbumButtonsBox);
		addAlbumPane.setPadding(new Insets(400,300,200,850));
		Scene addAlbumScene=new Scene(addAlbumPane,1000,1000);
		
		// add movie Scene:
		TextField movieTitleField=new TextField();
		TextField movieNumberOfCopiesField=new TextField();
		ComboBox<String> movieRatingComboBox=new ComboBox<String>();
		movieRatingComboBox.getItems().addAll("HR","DR","AC");
		TextField movieCodeField=new TextField();
		Label movieTitleLabel=new Label("Movie Title :");
		Label movieNumberOfCopiesLabel=new Label("Movie Of Copies :");
		Label movieRatingLabel=new Label("Movie Rating :");
		Label movieCodeLabel=new Label("Movie Code :");
		Button addMovieBackButton=new Button("Back");
		Button addMovieProceedButton=new Button("Proceed");
		
		HBox movieTitleBox=new HBox(20);
		movieTitleBox.getChildren().addAll(movieTitleLabel,movieTitleField);
		HBox movieNumberOfCopiesBox=new HBox(20);
		movieNumberOfCopiesBox.getChildren().addAll(movieNumberOfCopiesLabel,movieNumberOfCopiesField);
		HBox movieRatingBox=new HBox(20);
		movieRatingBox.getChildren().addAll(movieRatingLabel,movieRatingComboBox);
		HBox movieCodeBox=new HBox(20);
		movieCodeBox.getChildren().addAll(movieCodeLabel,movieCodeField);
		HBox addMovieButtonsBox=new HBox(20);
		addMovieButtonsBox.getChildren().addAll(addMovieProceedButton,addMovieBackButton);
		
		VBox addMoviePane=new VBox(30);
		addMoviePane.getChildren().addAll(movieTitleBox,movieNumberOfCopiesBox,movieRatingBox,movieCodeBox,addMovieButtonsBox);
		addMoviePane.setPadding(new Insets(400,300,200,850));
		
		Scene addMovieScene=new Scene(addMoviePane,1000,1000);
		
		//Search media Scene:
		
		ComboBox<String> searchMediaSelectionBox=new ComboBox<String>();
		searchMediaSelectionBox.getItems().add("Game");
		searchMediaSelectionBox.getItems().add("Album");
		searchMediaSelectionBox.getItems().add("Movie");
		searchMediaSelectionBox.setPromptText("ENTER THE MEDIA TYPE HERE");
		Button searchMediaproceedButton=new Button("PROCEED!!");
		Button searchMediaBackButton=new Button("Back");
		
		
		searchMediaSelectionBox.setPrefSize(300, 70);
		searchMediaSelectionBox.setStyle(ButtonColor);
		
		searchMediaproceedButton.setPrefSize(250, 35);
		searchMediaproceedButton.setStyle(ButtonColor);
		
		searchMediaBackButton.setPrefSize(250, 35);
		searchMediaBackButton.setStyle(ButtonColor);
		
		
		
		HBox searchMediabuttonsBox=new HBox(20);
		searchMediabuttonsBox.getChildren().addAll(searchMediaproceedButton,searchMediaBackButton);
		GridPane searchMediaTypeSelectionMenu=new GridPane();
		searchMediaTypeSelectionMenu.getChildren().addAll(searchMediaSelectionBox,searchMediabuttonsBox);
		searchMediaTypeSelectionMenu.setPadding(new Insets(500,150,0,750));
		searchMediaTypeSelectionMenu.setVgap(30);
		searchMediaTypeSelectionMenu.setHgap(20);
		searchMediaTypeSelectionMenu.setConstraints(searchMediaSelectionBox, 0, 0);
		searchMediaTypeSelectionMenu.setConstraints(searchMediabuttonsBox, 0, 1);
		Scene searchMediaTypeSelectionScene=new Scene(searchMediaTypeSelectionMenu,1000,1000);
		
		//search album Scene:
			Label searchAlbumCodeLabel=new Label("Album Code :");
			TextField searchAlbumCodeField=new TextField();
			Label albumInfoLabel=new Label("Album Info : ");
			TextArea albumInfoArea=new TextArea();
			Button searchAlbumButton = new Button("Search");
			Button searchAlbumBackButton=new Button("Back");
				
			HBox searchAlbumCodeBox=new HBox(20);
			searchAlbumCodeBox.getChildren().addAll(searchAlbumCodeLabel,searchAlbumCodeField);
			
			HBox searchAlbumInfoBox=new HBox(20);
			searchAlbumInfoBox.getChildren().addAll(albumInfoLabel,albumInfoArea);
			
			HBox searchAlbumButtons=new HBox(20);
			searchAlbumButtons.getChildren().addAll(searchAlbumButton,searchAlbumBackButton);
			
			VBox searchAlbumPane=new VBox(30);
			searchAlbumPane.getChildren().addAll(searchAlbumCodeBox,searchAlbumInfoBox,searchAlbumButtons);
			searchAlbumPane.setPadding(new Insets(400,500,200,700));
			Scene searchAlbumScene=new Scene(searchAlbumPane,1000,1000);
			
		//search game Scene:
			
			Label searchGameCodeLabel=new Label("Game Code :");
			TextField searchGameCodeField=new TextField();
			Label gameInfoLabel=new Label("Game Info : ");
			TextArea gameInfoArea=new TextArea();
			Button searchGameButton = new Button("Search");
			Button searchGameBackButton=new Button("Back");
				
			HBox searchGameCodeBox=new HBox(20);
			searchGameCodeBox.getChildren().addAll(searchGameCodeLabel,searchGameCodeField);
			
			HBox searchGameInfoBox=new HBox(20);
			searchGameInfoBox.getChildren().addAll(gameInfoLabel,gameInfoArea);
			
			HBox searchGameButtons=new HBox(20);
			searchGameButtons.getChildren().addAll(searchGameButton,searchGameBackButton);
			
			VBox searchGamePane=new VBox(30);
			searchGamePane.getChildren().addAll(searchGameCodeBox,searchGameInfoBox,searchGameButtons);
			searchGamePane.setPadding(new Insets(400,500,200,700));
			Scene searchGameScene=new Scene(searchGamePane,1000,1000);
			
			//search movie Scene:
			Label searchMovieCodeLabel=new Label("Movie Code :");
			TextField searchMovieCodeField=new TextField();
			Label movieInfoLabel=new Label("Movie Info : ");
			TextArea movieInfoArea=new TextArea();
			Button searchMovieButton = new Button("Search");
			Button searchMovieBackButton=new Button("Back");
				
			HBox searchMovieCodeBox=new HBox(20);
			searchMovieCodeBox.getChildren().addAll(searchMovieCodeLabel,searchMovieCodeField);
			
			HBox searchMovieInfoBox=new HBox(20);
			searchMovieInfoBox.getChildren().addAll(movieInfoLabel,movieInfoArea);
			
			HBox searchMovieButtons=new HBox(20);
			searchMovieButtons.getChildren().addAll(searchMovieButton,searchMovieBackButton);
			
			VBox searchMoviePane=new VBox(30);
			searchMoviePane.getChildren().addAll(searchMovieCodeBox,searchMovieInfoBox,searchMovieButtons);
			searchMoviePane.setPadding(new Insets(400,500,200,700));
			Scene searchMovieScene=new Scene(searchMoviePane,1000,1000);
			
			
		// home Page buttons

		Button customerButton = new Button("Customer");
		customerButton.setPrefSize(300, 60);
		customerButton.setStyle(ButtonColor);

		customerButton.setOnAction(e -> {
			System.out.println("customerClicked");
			primaryStage.setScene(customerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Customer Menu");
			primaryStage.show();

		});

		Button MediaButton = new Button("Media");
		MediaButton.setPrefSize(300, 60);
		MediaButton.setStyle(ButtonColor);
		MediaButton.setOnAction(e -> {
			System.out.println("mediaClicked");
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});

		Button RentButton = new Button("Rent");
		RentButton.setPrefSize(300, 60);
		RentButton.setStyle(ButtonColor);
		RentButton.setOnAction(e -> {
			System.out.println("RentButtonClicked");
		});

		StackPane imagePane = new StackPane(homeImageView);
		VBox mainButtonsPane = new VBox(40);
		mainButtonsPane.getChildren().addAll(customerButton, MediaButton, RentButton);

		Button exitButton = new Button("Exit!");
		exitButton.setPrefSize(300, 60);
		exitButton.setStyle("-fx-background-color: Red; " + "-fx-text-fill: White;");

		BorderPane mainPane = new BorderPane();
		mainPane.setCenter(imagePane);
		mainPane.setLeft(mainButtonsPane);
		mainPane.setRight(exitButton);
		mainPane.setMargin(mainButtonsPane, new Insets(380, 100, 100, 200));
		mainPane.setPadding(new Insets(10));

		// Main scene

		Scene mainScene = new Scene(mainPane, 1000, 1000);
		primaryStage.setScene(mainScene);
		primaryStage.setFullScreen(true);
		primaryStage.setTitle("Media Library System");
		primaryStage.show();
		
		
		

		addMediaButton.setOnAction(e->{
			primaryStage.setScene(mediaTypeSelectionScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Add Media System");
			primaryStage.show();
		});
		
		
		searchMediaButton.setOnAction(e->{
			primaryStage.setScene(searchMediaTypeSelectionScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Search Media System");
			primaryStage.show();
		});
		
		
		addMediaBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		addMovieBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		searchMediaBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		
		
		homeButton.setOnAction(e -> {
			primaryStage.setScene(mainScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Library System");
			primaryStage.show();
		});

		addcustomerButton.setOnAction(e -> {
			primaryStage.setScene(addCustomerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Add Customer Menu");
			primaryStage.show();
		});

		backButton.setOnAction(e -> {
			primaryStage.setScene(customerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Customer Menu");
			primaryStage.show();
		});
		
		

		backButton1.setOnAction(e -> {
			primaryStage.setScene(customerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Customer Menu");
			primaryStage.show();
		});
		backButton2.setOnAction(e -> {
			primaryStage.setScene(customerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Customer Menu");
			primaryStage.show();
		});

		backButton3.setOnAction(e -> {
			primaryStage.setScene(customerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Customer Menu");
			primaryStage.show();
		});
		
		
		returnButton.setOnAction(e->{
			primaryStage.setScene(mainScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Library System");
			primaryStage.show();
		});
		
		addGameBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		searchGameBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		searchMovieBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		searchAlbumBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		addAlbumBackButton.setOnAction(e->{
			primaryStage.setScene(mediaScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Media Menu");
			primaryStage.show();
		});
		
		deletecustomerButton.setOnAction(e -> {
			primaryStage.setScene(deleteCustomerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Delete Customer Menu");
			primaryStage.show();
		});

		searchCustomerButton.setOnAction(e -> {
			primaryStage.setScene(searchCustomerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Search Customer Menu");
			primaryStage.show();
		});
		
		addGameProceedButton.setOnAction(e->{
			
			String gameTitle=gameTitleField.getText();
			int gameNumberOfCopies=Integer.parseInt(gameNumberOfCopiesField.getText());
			double gameWeight=Double.parseDouble(gameNumberOfCopiesField.getText());
			String gameCode=gameCodeField.getText();
			
			mdr.addGame(gameTitle, gameNumberOfCopies, gameWeight, gameCode);
			
		});
		
		addMovieProceedButton.setOnAction(e->{
			String movieTitle=movieTitleField.getText();
			int movieNumberOfCopies=Integer.parseInt(movieNumberOfCopiesField.getText());
			String movieCode=movieCodeField.getText();
			String movieRating=movieRatingComboBox.getValue();
			
			
			mdr.addMovie(movieTitle, movieNumberOfCopies, movieRating, movieCode);
			
			
		});
		
		addAlbumProceedButton.setOnAction(e->{
			String albumTitle=albumTitleField.getText();
			int albumNumberOfCopies=Integer.parseInt(albumNumberOfCopiesField.getText());
			String albumCode=albumCodeField.getText();
			String albumArtist=albumArtistField.getText();
			String albumSongs=songsField.getText();
			
			mdr.addAlbum(albumTitle, albumNumberOfCopies, albumArtist, albumSongs, albumCode);
		});
		
		

		updateCustomerButton.setOnAction(e -> {
			primaryStage.setScene(updateCustomerScene);
			primaryStage.setFullScreen(true);
			primaryStage.setTitle("Update Customer Menu");
			primaryStage.show();
		});
		

		addButton.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, addinfoPane);
			String customerId = idField.getText();

			TextField nameField = (TextField) getNode(1, 1, addinfoPane);
			String customerName = nameField.getText();

			TextField addressField = (TextField) getNode(2, 1, addinfoPane);
			String customerAddress = addressField.getText();

			TextField mobileField = (TextField) getNode(3, 1, addinfoPane);
			String customerMobile = mobileField.getText();

			ComboBox<String> planNode = (ComboBox<String>) getNode(4, 1, addinfoPane);
			String customerPlan = planNode.getValue();

			mdr.addCustomer(customerName, customerAddress, customerPlan, customerId, customerMobile);
		});
		searchButton.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, searchinfoPane);
			String customerId = idField.getText();

			for (int i = 0; i < mdr.customerList.size(); i++) {
				if (mdr.customerList.get(i).getCustomerID().compareTo(customerId) == 0) {
					infoArea.setFont(Font.font("Calibri font", FontWeight.LIGHT, FontPosture.REGULAR, 12));
					infoArea.setText("Customer Address : " + mdr.customerList.get(i).getCustomerAddress() 
							+ "\n" + "Customer Mobile : " + mdr.customerList.get(i).getCustomerMobile()
							+ "\n" + "Customer Name : " + mdr.customerList.get(i).getCustomerName()
							+ "\n" + "Customer Plan : " + mdr.customerList.get(i).getcustomerPlan()
							);
					System.out.println("Found");
					break;
				} else {
					
					infoArea.setText("");
					String notFound="Not Found!";
					infoArea.setText(notFound);
					infoArea.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
					System.out.println("notfound");

				}

			}
		});

		updateButton.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, updateinfoPane);
			String customerId = idField.getText();

			for (int i = 0; i < mdr.customerList.size(); i++) {
				if (mdr.customerList.get(i).getCustomerID().compareTo(customerId) == 0) {
					TextField addressField = (TextField) getNode(2, 1, updateinfoPane);
					mdr.customerList.get(i).setCustomerAddress(addressField.getText());
					TextField mobileField = (TextField) getNode(3, 1, updateinfoPane);
					mdr.customerList.get(i).setCustomerMobile(mobileField.getText());
					TextField nameField = (TextField) getNode(1, 1, updateinfoPane);
					mdr.customerList.get(i).setCustomerName(nameField.getText());
//					TextField outPlanField = (TextField) getNode(4, 1, updateinfoPane);
//					outPlanField.setText(mdr.customerList.get(i).getcustomerPlan())	;

					System.out.println("Updated");
					break;
				} else {
					System.out.println("NotUpdated");
				}

			}
		});

		deleteButton.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, deleteinfoPane);
			String customerId = idField.getText();

			for (int i = 0; i < mdr.customerList.size(); i++) {
				if (mdr.customerList.get(i).getCustomerID().compareTo(customerId) == 0) {
					mdr.customerList.remove(i);
					idField.setText("");
					TextField addressField = (TextField) getNode(2, 1, deleteinfoPane);
					addressField.setText("");
					TextField mobileField = (TextField) getNode(3, 1, deleteinfoPane);
					mobileField.setText("");
					TextField nameField = (TextField) getNode(1, 1, deleteinfoPane);
					nameField.setText("");
					TextField outPlanField = (TextField) getNode(4, 1, deleteinfoPane);
					outPlanField.setText("");
					break;
				}
			}
		});

		findButton.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, deleteinfoPane);
			String customerId = idField.getText();

			for (int i = 0; i < mdr.customerList.size(); i++) {
				if (mdr.customerList.get(i).getCustomerID().compareTo(customerId) == 0) {
					TextField addressField = (TextField) getNode(2, 1, deleteinfoPane);
					addressField.setText(mdr.customerList.get(i).getCustomerAddress());
					TextField mobileField = (TextField) getNode(3, 1, deleteinfoPane);
					mobileField.setText(mdr.customerList.get(i).getCustomerMobile());
					TextField nameField = (TextField) getNode(1, 1, deleteinfoPane);
					nameField.setText(mdr.customerList.get(i).getCustomerName());
					TextField outPlanField = (TextField) getNode(4, 1, deleteinfoPane);
					outPlanField.setText(mdr.customerList.get(i).getcustomerPlan());

					System.out.println("Found");
					break;
				} else {
					TextField addressField = (TextField) getNode(2, 1, deleteinfoPane);
					addressField.setText("");
					TextField mobileField = (TextField) getNode(3, 1, deleteinfoPane);
					mobileField.setText("");
					TextField nameField = (TextField) getNode(1, 1, deleteinfoPane);
					nameField.setText("");
					TextField outPlanField = (TextField) getNode(4, 1, deleteinfoPane);
					outPlanField.setText("");
					System.out.println("notfound");

				}

			}
		});

		findButton1.setOnAction(e -> {
			TextField idField = (TextField) getNode(0, 1, updateinfoPane);
			String customerId = idField.getText();

			for (int i = 0; i < mdr.customerList.size(); i++) {
				if (mdr.customerList.get(i).getCustomerID().compareTo(customerId) == 0) {
					TextField addressField = (TextField) getNode(2, 1, updateinfoPane);
					addressField.setText(mdr.customerList.get(i).getCustomerAddress());
					TextField mobileField = (TextField) getNode(3, 1, updateinfoPane);
					mobileField.setText(mdr.customerList.get(i).getCustomerMobile());
					TextField nameField = (TextField) getNode(1, 1, updateinfoPane);
					nameField.setText(mdr.customerList.get(i).getCustomerName());
					TextField outPlanField = (TextField) getNode(4, 1, updateinfoPane);
					outPlanField.setText(mdr.customerList.get(i).getcustomerPlan());

					System.out.println("Found");
					break;
				} else {
					TextField addressField = (TextField) getNode(2, 1, updateinfoPane);
					addressField.setText("");
					TextField mobileField = (TextField) getNode(3, 1, updateinfoPane);
					mobileField.setText("");
					TextField nameField = (TextField) getNode(1, 1, updateinfoPane);
					nameField.setText("");
					TextField outPlanField = (TextField) getNode(4, 1, updateinfoPane);
					outPlanField.setText("");
					System.out.println("notfound");

				}

			}
		});

		exitButton.setOnAction(e -> {
			Platform.exit();
		});
		
		proceedButton.setOnAction(e->{
			ComboBox<String> mediaType=(ComboBox<String>) getNode(0,0,typeSelectionMenu);
			String mediaTypeInput = mediaType.getValue();
			
			if(mediaTypeInput.compareToIgnoreCase("game")==0) {
				primaryStage.setScene(addGameScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Add Game Menu");
				primaryStage.show();
			}else if(mediaTypeInput.compareToIgnoreCase("album")==0) {
				primaryStage.setScene(addAlbumScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Add Album Menu");
				primaryStage.show();
			}else if(mediaTypeInput.compareToIgnoreCase("movie")==0) {
				primaryStage.setScene(addMovieScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Add Movie Menu");
				primaryStage.show();
			}
		});
		
		searchMediaproceedButton.setOnAction(e->{
			ComboBox<String> searchMediaType=(ComboBox<String>) getNode(0,0,searchMediaTypeSelectionMenu);
			String searchMediaTypeInput = searchMediaSelectionBox.getValue();
			
			if(searchMediaTypeInput.compareToIgnoreCase("album")==0) {
				primaryStage.setScene(searchAlbumScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Search Album Menu");
				primaryStage.show();
			}else if(searchMediaTypeInput.compareToIgnoreCase("game")==0) {
				primaryStage.setScene(searchGameScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Search Game Menu");
				primaryStage.show();
			}else if(searchMediaTypeInput.compareToIgnoreCase("movie")==0) {
				primaryStage.setScene(searchMovieScene);
				primaryStage.setFullScreen(true);
				primaryStage.setTitle("Search Game Menu");
				primaryStage.show();
			}
			
			
		});

	}

	public static GridPane getinfoPane() {
		GridPane infoPane = new GridPane();

		Label customerId = new Label("Customer ID:");
		Label customerName = new Label("Customer Name:");
		Label customerAddress = new Label("Customer Address:");
		Label customerMobile = new Label("Customer Mobile:");
		Label customerPlan = new Label("Customer Plan:");

		TextField idField = new TextField();
		idField.setPromptText("ID here");
		TextField NameField = new TextField();
		NameField.setPromptText("Name here");
		TextField AddressField = new TextField();
		AddressField.setPromptText("Address here");
		TextField MobileField = new TextField();
		MobileField.setPromptText("Mobile here");

		infoPane.setPadding(new Insets(400, 300, 100, 800));
		infoPane.setVgap(50);
		infoPane.setHgap(20);
		infoPane.setConstraints(customerId, 0, 0);
		infoPane.setConstraints(customerName, 0, 1);
		infoPane.setConstraints(customerAddress, 0, 2);
		infoPane.setConstraints(customerMobile, 0, 3);
		infoPane.setConstraints(customerPlan, 0, 4);

		infoPane.setConstraints(idField, 1, 0);
		infoPane.setConstraints(NameField, 1, 1);
		infoPane.setConstraints(AddressField, 1, 2);
		infoPane.setConstraints(MobileField, 1, 3);
		infoPane.getChildren().addAll(customerId, customerName, customerAddress, customerMobile, customerPlan, idField,
				NameField, AddressField, MobileField);

		return infoPane;
	}

	public Node getNode(int row, int column, GridPane gridPane) {
		Node result = null;
		ObservableList<Node> childrens = gridPane.getChildren();
		for (Node node : childrens) {
			if (gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
				result = node;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
