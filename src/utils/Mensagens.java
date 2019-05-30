package utils;

import javax.swing.JOptionPane;

public class Mensagens {

    public static void mensagemAviso(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    public static void mensagemConfirmacao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void mensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void mensagemSair(String mensagem) {
        int s = JOptionPane.showConfirmDialog(null, mensagem, "Sair", JOptionPane.YES_NO_OPTION);
        if (s == 0) {
            System.exit(0);
        }
    }

    public static int mensagemApagar(String mensagem) {
        int s = JOptionPane.showConfirmDialog(null, mensagem, "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (s == 0) {
            return 0;
        }
        return 1;
    }
}
