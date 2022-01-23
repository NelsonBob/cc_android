package com.esgi.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductsListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        main_content: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.produit_list_fragment,
            main_content,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val product1 = Product("Petits pois et carottes", "Cassegrain",
            "3083680085304", "A"
            ,"230kCal/Part"
            ,"https://i.imgur.com/JhYpzdR.jpeg"
            ,"400 g (280 g net égoutté)"
            , arrayOf("France", "Japon", "Suisse")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))
        val product3 = Product("Langar Wali Dal & Missi Roti", "Roti",
            "3083680085304", "A"
            ,"204kCal/Part"
            ,"https://i.imgur.com/FF4EdLY.jpeg"
            ,"400 g (280 g net égoutté)"
            , arrayOf("France", "Japon", "Suisse")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))
        val product4 = Product("Roses are red, pizza sauce is too, I ordered a large, and none of it's for you", "Pizza",
            "3083680085304", "A"
            ,"134kCal/Part"
            ,"https://i.imgur.com/aqq6b05.png"
            ,"400 g (280 g net égoutté)"
            , arrayOf("France", "Japon", "Suisse")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))
        val product5 = Product("Salade caprese", "Salade",
            "3083680085304", "A"
            ,"234kCal/Part"
            ,"https://i.imgur.com/wjqsoQL.jpeg"
            ,"400 g (280 g net égoutté)"
            , arrayOf("France", "Japon", "Suisse")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))
        val product6 = Product("Homemade courgettes blossoms stuffed with blue cheese and salade caprese", "Salade",
            "3083680085304", "A"
            ,"234kCal/Part"
            ,"https://i.imgur.com/Os7ynRJ.jpeg"
            ,"400 g (280 g net égoutté)"
            , arrayOf("France", "Japon", "Suisse")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))


        val product2 = Product("Kebab", "Turc",
            "40593402950", "GROS"
            ,"1000kCal/Part"
            ,"https://i.imgur.com/s2dHXJ6.jpeg"
            ,"400 g (280 g net égoutté)"
            , arrayOf("93", "92", "91")
            , arrayOf("Petits pois 66%", "eau", "garniture 2,8%", "salade", "oignon", "grelot", "sucre", "sel", "arôme naturel")
            , arrayOf("Aucune")
            , arrayOf("Aucune"))
         val products = arrayOf(product1,product2,product3,product4,product5,product6,product1,product2,product3,product4,product5,product6)
        view.findViewById<RecyclerView>(R.id.products_View).run{
            adapter = RecyclerAdapter(
                products,
                listener = object : OnListProductClickListener {
                    override fun onProductClicked(position: Int) {
                        findNavController().navigate(
                            ProductsListFragmentDirections.actionProductsListFragmentToProductDetailsFragment2(
                                products[position]
                            )

                        )
                    }

                }
            )
            layoutManager = GridLayoutManager(requireContext(),1)
        }
    }

}