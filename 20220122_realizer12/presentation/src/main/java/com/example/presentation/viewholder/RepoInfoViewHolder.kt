package com.example.presentation.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.presentation.databinding.ItemRepoInfoBinding
import com.example.presentation.model.PresentationUserRepo

class RepoInfoViewHolder(
    val binding: ItemRepoInfoBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(userRepo: PresentationUserRepo) {

        //레포 이름 넣어줌.
        binding.tvRepoName.text = userRepo.full_name

        //레포 url 넣어줌.
        binding.tvRepoUrl.text = userRepo.url

        //레포 별점 넣어줌.
        binding.tvStarCount.text = userRepo.stargazers_count.toString()
    }
}