package com.takonyaa.mobile.film;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
    }

}
        public class ImageAdapter extends BaseAdapter {
            private Context mContext;

            public ImageAdapter(Context c) {
                mContext = c;
            }

            public int getCount() {
                return myThumbIds.length;
            }

            public Object getItem(int position) {
                return null;
            }

            public long getItemId(int position) {
                return 0;
            }
            // buat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                //jika tidak di daur ulang
                if (convertView == null) {
                    //menginisialisasi beberapa atribut
                    imageView = new ImageView(mContext);
                    imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setPadding(8, 8, 8, 8);
                } else {
                    imageView = (ImageView) convertView;
                }

                imageView.setImageResource(myThumbIds[position]);
                return imageView;
            }

            // menampilkan referensi gambar di gridView
            private Integer[] myThumbIds = {
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid,
                    R.drawable.gambargrid, R.drawable.gambargrid
            };
        }
    }