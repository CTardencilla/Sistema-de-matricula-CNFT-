package org.example.sistemadematricula;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class MatriculaController {

    // =========================
    // CAMPOS DEL FORMULARIO
    // =========================

    @FXML
    private TextField txtNombres;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private DatePicker dpFechaNacimiento;

    @FXML
    private ComboBox<String> cbDepartamento;

    @FXML
    private ListView<String> lvCursos;


    // =========================
    // MODALIDAD
    // =========================

    @FXML
    private RadioButton rbPresencial;

    @FXML
    private RadioButton rbVirtual;

    private ToggleGroup grupoModalidad;


    // =========================
    // HORARIOS
    // =========================

    @FXML
    private CheckBox chkManana;

    @FXML
    private CheckBox chkTarde;

    @FXML
    private CheckBox chkNoche;


    // =========================
    // NORMAS
    // =========================

    @FXML
    private CheckBox chkNormas;


    // =========================
    // TABLEVIEW
    // =========================

    @FXML
    private TableView<Estudiante> tablaEstudiantes;

    @FXML
    private TableColumn<Estudiante, String> colNombre;

    @FXML
    private TableColumn<Estudiante, String> colDepartamento;

    @FXML
    private TableColumn<Estudiante, String> colCurso;

    @FXML
    private TableColumn<Estudiante, String> colModalidad;

    @FXML
    private TableColumn<Estudiante, String> colHorario;

    @FXML
    private TableColumn<Estudiante, LocalDate> colFechaNacimiento;


    // Lista donde se guardarán los estudiantes
    private final ObservableList<Estudiante> listaEstudiantes =
            FXCollections.observableArrayList();


    // ============================================================
    // INITIALIZE
    // Se ejecuta automáticamente cuando se abre la ventana
    // ============================================================

    @FXML
    public void initialize() {

        // -------------------------
        // DEPARTAMENTOS
        // -------------------------

        cbDepartamento.getItems().addAll(
                "Boaco",
                "Carazo",
                "Chinandega",
                "Chontales",
                "Estelí",
                "Granada",
                "Jinotega",
                "León",
                "Madriz",
                "Managua",
                "Masaya",
                "Matagalpa",
                "Nueva Segovia",
                "Río San Juan",
                "Rivas",
                "Costa Caribe Norte",
                "Costa Caribe Sur"
        );


        // -------------------------
        // CURSOS
        // -------------------------

        lvCursos.getItems().addAll(
                "Programación",
                "Excel",
                "Redes",
                "Diseño Gráfico"
        );

        lvCursos.getSelectionModel().setSelectionMode(
                SelectionMode.SINGLE
        );


        // -------------------------
        // MODALIDAD
        // -------------------------

        grupoModalidad = new ToggleGroup();

        rbPresencial.setToggleGroup(grupoModalidad);
        rbVirtual.setToggleGroup(grupoModalidad);


        // -------------------------
        // CONFIGURAR TABLEVIEW
        // -------------------------

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombreCompleto")
        );

        colDepartamento.setCellValueFactory(
                new PropertyValueFactory<>("departamento")
        );

        colCurso.setCellValueFactory(
                new PropertyValueFactory<>("curso")
        );

        colModalidad.setCellValueFactory(
                new PropertyValueFactory<>("modalidad")
        );

        colHorario.setCellValueFactory(
                new PropertyValueFactory<>("horario")
        );

        colFechaNacimiento.setCellValueFactory(
                new PropertyValueFactory<>("fechaNacimiento")
        );


        // Conectar la lista con la tabla
        tablaEstudiantes.setItems(listaEstudiantes);
    }


    // ============================================================
    // REGISTRAR ESTUDIANTE
    // ============================================================

    @FXML
    private void registrarEstudiante() {

        // Obtener los datos escritos
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String usuario = txtUsuario.getText().trim();
        String contrasena = txtContrasena.getText();


        // ========================================================
        // VALIDAR NOMBRES
        // ========================================================

        if (nombres.isEmpty()) {

            mostrarError(
                    "El campo nombres no puede quedar vacío."
            );

            return;
        }


        // ========================================================
        // VALIDAR APELLIDOS
        // ========================================================

        if (apellidos.isEmpty()) {

            mostrarError(
                    "El campo apellidos no puede quedar vacío."
            );

            return;
        }


        // ========================================================
        // VALIDAR USUARIO
        // ========================================================

        if (usuario.isEmpty()) {

            mostrarError(
                    "Debe ingresar un nombre de usuario."
            );

            return;
        }


        if (usuario.length() < 5) {

            mostrarError(
                    "El usuario debe tener al menos 5 caracteres."
            );

            return;
        }


 //Continuacion del codigo de mi compañero
