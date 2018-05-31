package iktaniyalol.ru.technicalassistant.interfaces;

import android.os.Bundle;
import android.view.ViewGroup;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutMe extends MainActivity {
    ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.mipmap.profile_picture)
                .setCover(R.mipmap.profile_cover)
                .setName("Кисиленко Анастасия")
                .setSubTitle("Разработчик приложения")
                .setBrief("Собственный проект для IT Школы Samsung")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .addGitHubLink("Iktaniyalol")
                .setVersionNameAsAppSubTitle()
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        addContentView(view, lp);
    }
}
