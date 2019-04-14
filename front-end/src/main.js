import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router';
import Index from './pages/Index';
import Skills from './pages/SkillsView';
import Contact from './pages/Contact';
import About from "./pages/About";


Vue.config.productionTip = false;

Vue.use(VueRouter);


const routes = [
  { name: "home", path: "/", component: Index },
  { name: "skills", path: "/skills", component: Skills},
  { name: 'contact', path: '/contact', component: Contact },
  { name: 'about', path: '/about', component: About }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

new Vue({
  render: h => h(App),
  router
}).$mount('#app');
