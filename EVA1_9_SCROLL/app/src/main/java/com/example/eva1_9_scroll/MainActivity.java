package com.example.eva1_9_scroll;
/*
* Oscar Alejandro Rosique Vera
* 17550484
* ISC
* APP1*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMensaje;
    final String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ultrices, velit vel elementum tempus, turpis velit mollis dolor, porta posuere augue ex eget erat. Sed efficitur maximus justo vitae faucibus. Nulla condimentum ex enim, non condimentum elit auctor non. Morbi dictum lacus et odio posuere, varius maximus dolor convallis. Mauris risus mi, maximus vitae fermentum eget, ornare eu enim. Fusce sed nisl varius, ornare ante id, sagittis purus. Mauris ultrices tortor dolor, in interdum arcu fringilla non. Aenean congue tellus ut iaculis feugiat. Praesent ipsum tortor, tempus nec sem eu, aliquet malesuada purus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Ut quis magna ut ante euismod sodales id vel nunc. Nulla posuere molestie mollis. Praesent a vehicula nunc. Proin quis neque eros. Pellentesque quis sagittis nisi, non consequat ipsum. Ut sem elit, efficitur sit amet purus non, accumsan aliquam mauris." +
            "Praesent quis nisl nec elit iaculis varius. Cras ultricies mauris vitae libero fringilla, nec mattis odio rutrum. Praesent eget nunc dui. Quisque ullamcorper laoreet consequat. Nunc turpis mauris, hendrerit vitae vehicula dictum, accumsan quis nunc. Sed at dolor vel tellus fringilla sollicitudin vitae non augue. Duis aliquet diam eu feugiat lacinia. Vivamus euismod mollis blandit. Duis maximus, odio quis semper ultrices, lacus nisl tincidunt lacus, eget cursus ex enim et magna. Vivamus rhoncus enim ut ante egestas, at finibus leo mollis. Phasellus dignissim nunc lectus, non mattis nulla rhoncus nec. Fusce egestas varius suscipit. Nullam pharetra risus vitae tellus porttitor, ut scelerisque dui lacinia. Praesent vehicula dapibus lectus. Maecenas varius egestas elit, in molestie nisi ultrices ut. " +
            "Etiam et ultricies ligula. Nullam nec magna hendrerit, blandit magna in, lacinia dui. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse et efficitur nisl. Aliquam eu euismod ex. Aenean dui urna, elementum sit amet cursus eget, semper ut leo. Praesent placerat condimentum leo, sed posuere ante tempor at. Nullam pulvinar arcu et ante dignissim posuere. ";
    /*
    * Creamos un método onCreate para poder mostrar nuestro mensaje con muchos caracteres
    * y si el usuario cambia la orientación del telefono, este método va a volver a crear el mensaje para adaptarlo
    * a la orientación de la pantalla*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMensaje = findViewById(R.id.txtMensaje);
        txtMensaje.setText(mensaje);
    }
}
