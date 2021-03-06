<%@page import="controllers.LogIn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="Connexion">
		<fieldset>
			<legend>Connexion</legend>
			<p>Vous pouvez vous connecter via ce formulaire.</p>

			<label for="nom">Adresse email <span class="requis">*</span></label>
			<input type="email" id="email" name="email"
				maxlength="60" /> <span class="erreur">${form.erreurs['email']}</span>
			<br /> 
			<label for="motdepasse">Mot de passe
			<span class="requis">*</span>
			</label> 
			<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
			<span class="erreur">${form.erreurs['motdepasse']}</span> 
			<br/> 
			<input type="submit" value="Connexion" class="sansLabel" />
			<br/>
			<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>

		</fieldset>
	</form>
</body>
</html>