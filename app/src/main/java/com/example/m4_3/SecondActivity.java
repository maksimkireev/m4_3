package com.example.m4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Car> cars = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        setCarsData();

        RecyclerView recyclerView = findViewById(R.id.recycyler);


        CarAdap carAdap = new CarAdap(cars, this);

        recyclerView.setAdapter(carAdap);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setCarsData(){
        cars.add(new Car("Toyota Land Cruiser Prado", "Легендарный для нашей страны рамный полноприводный внедорожник с автоматической трансмиссией.\n", "Рыночная стоимость: 4 050 000", R.drawable.img_9));
        cars.add(new Car("Volkswagen Touareg\n", "Тем, кто ищет безопасную, комфортную и надёжную машину за 5 млн. рублей, можно рассмотреть Volkswagen Touareg.\n", "Рыночная стоимость: 4 990 000", R.drawable.img_10));
        cars.add(new Car("Audi Q5\n", "За такие деньги кроссовер, скорее всего, будет оборудован не бензиновым, а дизельным мотором мощностью 249 лошадиных сил.\n", "Рыночная стоимость: 4 150 000", R.drawable.img_2));
        cars.add(new Car("BMW X3\n", "BMW X3 – популярный у нас премиальный кроссовер всемирно известного немецкого бренда.\n", "Рыночная стоимость: 6140 000", R.drawable.img_3));
        cars.add(new Car("Ferrari F12berlinetta\n", "Представленный в 2012 г. 12-цилиндровая автомобиль развивал 740 л.с., но позже появились еще более мощные версии.\n", "Рыночная стоимость: 13 400 000", R.drawable.img_4));
        cars.add(new Car("Ferrari GTC4Lusso\n", "GTC4 Lusso — самая популярная модель Ferrari в России. В прошлом году продано 11 машин.\n", "Рыночная стоимость: 21 700 000", R.drawable.img_5));
        cars.add(new Car("Tesla Model X\n", "Электрокроссовер Tesla Model X с подъемными задними дверьми и впечатляющей динамикой не выглядит чужим среди суперкаров. До «сотни» он разгоняется за 3,1 секунды.\n", "Рыночная стоимость: 24 000 000", R.drawable.img_6));
        cars.add(new Car("Porsche Panamera", "Пятидверный спортивный фастбэк класса Гран Туризмо с переднемоторной компоновкой и полным или задним приводом.", "Рыночная стоимость: 17 800 000", R.drawable.img_7));
        cars.add(new Car("Mazda rx 8", "Эта машина до сих пор актуальна. За такие деньги эта машина вполне неплохой вариант для покупки.", "Рыночная стоимость: 650 000", R.drawable.img_8));
    }
}