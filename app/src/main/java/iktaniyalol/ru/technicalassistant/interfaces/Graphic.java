package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Graphic extends Math {
    private LineGraphSeries<DataPoint> series;
    DataPoint[] dataPoints;
    double x, k, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        switch (PreGraph.number) {
            case 1:
                x = -1;
                k = PreGraph.inp1;
                dataPoints = new DataPoint[2];
                for (int i = 0; i < 2; i++) {
                    dataPoints[i] = new DataPoint(x, x * k);

                    x = x + 2;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);


                break;
            case 2:
                x = -1;
                k = PreGraph.inp1;
                b = PreGraph.inp2;
                dataPoints = new DataPoint[2];
                for (int i = 0; i < 2; i++) {
                    dataPoints[i] = new DataPoint(x, x * k + b);
                    x = x + 2;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);

                break;
        }

    }


}
