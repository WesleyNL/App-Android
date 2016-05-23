package br.com.app.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.LinkedList;

import br.com.app.activity.chat.mensagens.ChatMensagensFragment;
import br.com.app.activity.chat.pesquisa.ChatPesquisaFragment;
import br.com.app.activity.forum.principal.ForumPrincipalFragment;

/**
 * Created by Jefferson on 21/05/2016.
 */
public class SampleFragmentPageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Encontrar Pessoas", "Mensagens", "Fórum" };
    private Context context;

    private LinkedList<Object> abasFragmentos = new LinkedList<Object>();

    public SampleFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        abasFragmentos.add(0, ChatPesquisaFragment.newInstance());
        abasFragmentos.add(1, ChatMensagensFragment.newInstance());
        abasFragmentos.add(2, ForumPrincipalFragment.newInstance());
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) abasFragmentos.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    public Object getAba(int position) {
        return abasFragmentos.get(position);
    }
}