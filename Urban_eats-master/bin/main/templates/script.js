$(function checkform(){
  $user_name = document.getElementById("username").value;
  $user_pwd = document.getElementById("password").value;
  if($user_name==''){
    alert("ユーザー名を入力してください");
    return false;
  }
  if($user_pwd ==''){
    alert("パスワードを入力してください");
    return false;
  }
  return trun;
})

