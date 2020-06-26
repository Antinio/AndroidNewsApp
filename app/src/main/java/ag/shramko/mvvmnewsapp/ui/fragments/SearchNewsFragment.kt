package ag.shramko.mvvmnewsapp.ui.fragments

import ag.shramko.mvvmnewsapp.R
import ag.shramko.mvvmnewsapp.ui.NewsActivity
import ag.shramko.mvvmnewsapp.ui.NewsViewModel
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}