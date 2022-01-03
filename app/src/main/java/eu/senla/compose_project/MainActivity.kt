package eu.senla.compose_project

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import eu.senla.compose_project.screens.QuestionsViewModel
import eu.senla.compose_project.ui.theme.Compose_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    TriviaHome()
                }
            }
        }
    }

    @Composable
    fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()){
        Questions(viewModel)
    }

    @Composable
    fun Questions(viewModel: QuestionsViewModel){
        val questions = viewModel.data.value.data?.toMutableList()

        Log.d("SIZE","Questions: ${questions?.size}")
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_projectTheme {

    }
}