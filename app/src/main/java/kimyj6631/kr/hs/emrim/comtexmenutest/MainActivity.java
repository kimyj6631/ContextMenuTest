package kimyj6631.kr.hs.emrim.comtexmenutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button)findViewById(R.id.but1);
        Button but2 = (Button)findViewById(R.id.but2);
    }
     public void onCreateContetMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
         super.onCreateContextMenu(menu,v,menuInfo);
         MenuInflater menuInflater=getMenuInflater();
         if(v.getId()==R.id.but1){
             menu.setHeaderTitle("배경색 변경");
                //menu.setHeaderIcon(R.drawable.icon1);
             menuInflater.inflate(R.menu.menu1,menu);

         }
         if(v.getId()==R.id.but2)
             menuInflater.inflate(R.menu.menu2,menu);
     }
}
