import java.lang.Math;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.stage.*;
public class Calculator extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage mystage)
	{
		mystage.setTitle("CALCULATOR");
		FlowPane flowpane=new FlowPane();
		Label l1=new Label("Enter No 1:");
		TextField t1=new TextField();
		Label l2=new Label("Enter No 2:");
		TextField t2=new TextField();
		Label l3=new Label("Answer:");
		TextField t3=new TextField();
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("*");
		Button b4=new Button("/");
		Button b5=new Button("clear");
		Button b6=new Button("sin");
		Button b7=new Button("cos");
		Button b8=new Button("tan");
		Button b9=new Button("sqrt");
		flowpane.getChildren().addAll(l1,t1,l2,t2,l3,t3,b1,b2,b3,b4,b6,b7,b8,b9,b5);
		Scene sc=new Scene(flowpane,500,500);
		mystage.setScene(sc);
		mystage.show();
		b1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int c=n1+n2;
				t3.setText(c+"");
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int c=n1-n2;
				t3.setText(c+"");
			}
		});
		b3.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int c=n1*n2;
				t3.setText(c+"");
			}
		});
		b4.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int c=n1/n2;
				t3.setText(c+"");
			}
		});
		b5.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				t1.clear();
				t2.clear();
				t3.clear();
			}
		});
		b6.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				double c=(Math.sin(n1*Math.PI/180));
				t3.setText(c+"");
			}
		});
		b7.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				double c=(Math.cos(n1*Math.PI/180));
				t3.setText(c+"");
			}
		});
		b8.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				double c=(Math.tan(n1*Math.PI/180));
				t3.setText(c+"");
			}
		});
		b9.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n1=Integer.parseInt(t1.getText());
				double c=(Math.sqrt(n1));
				t3.setText(c+"");
			}
		});
	}
}