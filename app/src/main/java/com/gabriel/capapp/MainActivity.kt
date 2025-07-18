package com.gabriel.capapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gabriel.capapp.ui.theme.CapAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CapAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RegistrationForm(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun RegistrationForm(modifier: Modifier = Modifier) {
    var nome by remember { mutableStateOf("") }
    var sobrenome by remember { mutableStateOf("") }
    var dataNascimento by remember { mutableStateOf("") }
    var genero by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var numero by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var nacionalidade by remember { mutableStateOf("") }
    var profissao by remember { mutableStateOf("") }

    val limparCampos = {
        nome = ""
        sobrenome = ""
        dataNascimento = ""
        genero = ""
        telefone = ""
        celular = ""
        email = ""
        endereco = ""
        numero = ""
        bairro = ""
        cidade = ""
        estado = ""
        cep = ""
        nacionalidade = ""
        profissao = ""
    }

    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState()), // Permite a rolagem da tela
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = nome, onValueChange = { nome = it }, label = { Text("Nome") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = sobrenome, onValueChange = { sobrenome = it }, label = { Text("Sobrenome") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = dataNascimento, onValueChange = { dataNascimento = it }, label = { Text("Data de Nascimento") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = genero, onValueChange = { genero = it }, label = { Text("Gênero") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = telefone, onValueChange = { telefone = it }, label = { Text("Telefone") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = celular, onValueChange = { celular = it }, label = { Text("Celular") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = endereco, onValueChange = { endereco = it }, label = { Text("Endereço") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = numero, onValueChange = { numero = it }, label = { Text("Número") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = bairro, onValueChange = { bairro = it }, label = { Text("Bairro") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = cidade, onValueChange = { cidade = it }, label = { Text("Cidade") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = estado, onValueChange = { estado = it }, label = { Text("Estado") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = cep, onValueChange = { cep = it }, label = { Text("CEP") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = nacionalidade, onValueChange = { nacionalidade = it }, label = { Text("Nacionalidade") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = profissao, onValueChange = { profissao = it }, label = { Text("Profissão") })
        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = {}) {
                Text("Enviar")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = limparCampos) {
                Text("Limpar")
            }
        }
    }
}