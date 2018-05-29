package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Graphic extends Math {
    private LineGraphSeries<DataPoint> series, series1;
    DataPoint[] dataPoints;
    DataPoint[] dataPoints1;
    double x, k, b, a, c, maxkord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        switch (PreGraph.number) {
            case 1:
                k = PreGraph.inp1;
                maxkord = PreGraph.inp2;
                if (!(maxkord == 0)) {
                    x = maxkord * (-1);
                } else {
                    x = -1;
                }

                dataPoints = new DataPoint[2];
                dataPoints[0] = new DataPoint(x, x * k);
                dataPoints[1] = new DataPoint(x * (-1), x * k * (-1));
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
            case 2:
                k = PreGraph.inp1;
                b = PreGraph.inp2;
                maxkord = PreGraph.inp3;
                if (!(maxkord == 0)) {
                    x = maxkord * (-1);
                } else {
                    x = -1;
                }
                dataPoints = new DataPoint[2];
                dataPoints[0] = new DataPoint(x, (x * k) + b);
                dataPoints[1] = new DataPoint(x * (-1), ((x * k * (-1)) + b));
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
            case 3:
                a = PreGraph.inp1;
                maxkord = PreGraph.inp2;
                x = -4;
                int j = 65;
                if (!(maxkord == 0)) {
                    x = maxkord * (-1);
                    j = (int) ((maxkord / 0.125) * 2);
                }

                dataPoints = new DataPoint[j];
                for (int i = 0; i < j; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a);
                    x = x + 0.125;
                    i++;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
            case 4:
                a = PreGraph.inp1;
                b = PreGraph.inp2;
                c = PreGraph.inp3;
                maxkord = PreGraph.inp4;
                double xnull = -b / (2 * a);
                double ynull = a * xnull * xnull + b * xnull + c;
                x = xnull - 2;
                j = 33;
                if (!(maxkord == 0)) {
                    x = xnull - (maxkord);
                    j = (int) ((maxkord / 0.125) * 2);
                }
                dataPoints = new DataPoint[j];
                dataPoints[(j - 1) / 2] = new DataPoint(xnull, ynull);
                for (int i = 0; i < (j - 1) / 2; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a + b * x + c);
                    x = x + 0.125;
                    i++;
                }
                x = xnull + 0.125;
                for (int i = ((j - 1) / 2) + 1; i < j; ) {
                    dataPoints[i] = new DataPoint(x, x * x * a + b * x + c);
                    x = x + 0.125;
                    i++;
                }
                series = new LineGraphSeries<>(dataPoints);
                graph.addSeries(series);
                graph.getViewport().setXAxisBoundsManual(true);
                graph.getViewport().setYAxisBoundsManual(true);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
            case 5:
                k = PreGraph.inp1;
                maxkord = PreGraph.inp2;
                x = -4;
                j = 128;
                if (!(maxkord == 0)) {
                    x = maxkord * (-1);
                    j = (int) ((maxkord / 0.03125));
                }
                dataPoints = new DataPoint[j];
                dataPoints1 = new DataPoint[j];
                for (int i = 0; i < j; i++) {
                    if (!(x == 0)) {
                        dataPoints[i] = new DataPoint(x, k / x);
                        x = x + 0.03125;
                    } else {
                        break;
                    }
                }
                x = 0.03125;
                for (int i = 0; i < j; i++) {
                    if (!(x == 0)) {
                        dataPoints1[i] = new DataPoint(x, k / x);
                        x = x + 0.03125;
                    } else {
                        break;
                    }
                }
                series = new LineGraphSeries<>(dataPoints);
                series1 = new LineGraphSeries<>(dataPoints1);
                graph.addSeries(series);
                graph.addSeries(series1);
                graph.getViewport().setYAxisBoundsManual(true);
                graph.getViewport().setXAxisBoundsManual(true);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
            case 6:
                k = PreGraph.inp1;
                b = PreGraph.inp2;
                c = PreGraph.inp3;
                maxkord = PreGraph.inp4;
                x = -4;
                j = 128;
                if (!(maxkord == 0)) {
                    x = maxkord * (-1);
                    j = (int) ((maxkord / 0.03125));
                }
                dataPoints = new DataPoint[j];
                dataPoints1 = new DataPoint[j];
                for (int i = 0; i < j; i++) {
                    if (!(x == 0)) {
                        dataPoints[i] = new DataPoint(x, (k / (x + b)) + c);
                        x = x + 0.03125;
                    } else {
                        break;
                    }
                }
                x = 0.03125;
                for (int i = 0; i < j; i++) {
                    if (!(x == 0)) {
                        dataPoints1[i] = new DataPoint(x, (k / (x + b)) + c);
                        x = x + 0.03125;
                    } else {
                        break;
                    }
                }
                series = new LineGraphSeries<>(dataPoints);
                series1 = new LineGraphSeries<>(dataPoints1);
                graph.addSeries(series);
                graph.addSeries(series1);
                graph.getViewport().setYAxisBoundsManual(true);
                graph.getViewport().setXAxisBoundsManual(true);
                if (!(maxkord == 0)) {
                    graph.getViewport().setYAxisBoundsManual(true);
                    graph.getViewport().setMaxY(maxkord);
                    graph.getViewport().setMinY(maxkord * (-1));
                    graph.getViewport().setXAxisBoundsManual(true);
                    graph.getViewport().setMaxX(maxkord);
                    graph.getViewport().setMinX(maxkord * (-1));
                }
                break;
        }

    }


}
