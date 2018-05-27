package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Graphic extends Math {
    private LineGraphSeries<DataPoint> series;
    DataPoint[] dataPoints;
    double x, k, b, a, c, maxx, maxy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        switch (PreGraph.number) {
            case 1:
                x = -1;
                k = PreGraph.inp1;
                maxx = PreGraph.inp2;
                maxy = PreGraph.inp3;

                dataPoints = new DataPoint[2];
                for (int i = 0; i < 2; i++) {
                    dataPoints[i] = new DataPoint(x, x * k);

                    x = x + 2;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                if (!(maxy == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxy);
                    graph.getViewport().setMinY(maxy * (-1));
                }
                if (!(maxx == 0)) {
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxx);
                    graph.getViewport().setMinX(maxx * (-1));
                }
                break;
            case 2:
                x = -1;
                k = PreGraph.inp1;
                b = PreGraph.inp2;
                maxx = PreGraph.inp3;
                maxy = PreGraph.inp4;
                dataPoints = new DataPoint[2];
                for (int i = 0; i < 2; i++) {
                    dataPoints[i] = new DataPoint(x, x * k + b);
                    x = x + 2;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                if (!(maxy == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxy);
                    graph.getViewport().setMinY(maxy * (-1));
                }
                if (!(maxx == 0)) {
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxx);
                    graph.getViewport().setMinX(maxx * (-1));
                }
                break;
            case 3:
                x = -2;
                a = PreGraph.inp1;
                maxx = PreGraph.inp2;
                maxy = PreGraph.inp3;
                dataPoints = new DataPoint[17];
                for (int i = 0; i < 17; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a);
                    x = x + 0.25;
                    i++;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if (!(maxy == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxy);
                    graph.getViewport().setMinY(maxy * (-1));
                }
                if (!(maxx == 0)) {
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxx);
                    graph.getViewport().setMinX(maxx * (-1));
                }
                break;
            case 4:
                a = PreGraph.inp1;
                b = PreGraph.inp2;
                c = PreGraph.inp3;
                maxx = PreGraph.inp4;
                maxy = PreGraph.inp5;
                double xnull = -b / (2 * a);
                double ynull = a * xnull * xnull + b * xnull + c;
                dataPoints = new DataPoint[17];
                dataPoints[8] = new DataPoint(xnull, ynull);
                x = xnull - 2;
                for (int i = 0; i < 8; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a + b * x + c);
                    x = x + 0.25;
                    i++;
                }
                x = xnull + 0.25;
                for (int i = 9; i < 17; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a + b * x + c);
                    x = x + 0.25;
                    i++;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if (!(maxy == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxy);
                    graph.getViewport().setMinY(maxy * (-1));
                }
                if (!(maxx == 0)) {
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxx);
                    graph.getViewport().setMinX(maxx * (-1));
                }
                break;
        }

    }


}
